@BeforeStep
void before(){
    println "Splunk: running before the ${hookContext.library} library's ${hookContext.step} step"
}

@AfterStep({ hookContext.step in config.afterSteps })
