@BeforeStep
void before(context){
    println "Splunk: running before the ${context.library} library's ${context.step} step"
}

@AfterStep({ context.step.equals("static_code_analysis") })
