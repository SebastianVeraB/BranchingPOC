def call(Map config=[:]) {

    if (config.allowsToDeployTo == "QA-Merge") {
        return true
    } else {
       return false
    }
    
}
