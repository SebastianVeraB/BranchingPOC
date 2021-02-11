def call(Map config=[:]) {

    if (config.allowsToDeployTo == "QA-Merge") {
        echo "ahhhhhhhhh"
        return true
    } else {
       return false
    }
    
}
