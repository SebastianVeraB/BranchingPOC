def call(Map config=[:]) {

    if (config.allowsToDeployTo == "QA-Merge") {
        echo "called allows to deploy to qa merge"
        return true
    } else {
       return false
 }
