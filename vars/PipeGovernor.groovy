def call(Map config=[:]) {

    if (config.allowsToDeployTo == "QA-Merge") {
        echo "called allows to deploy to qa merge"
        echo pullRequest.base
        return true
    } else {
       return false
 }
}
