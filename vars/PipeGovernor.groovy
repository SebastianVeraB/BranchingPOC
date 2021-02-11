import utils.Constants
def call(Map config=[:]) {

    if (config.allowsToDeployTo == "QA-Merge") {
        echo "called allows to deploy to qa merge"
        return pullRequest.base == Constants.CX_BASE
        
    } else {
       return false
 }
}
