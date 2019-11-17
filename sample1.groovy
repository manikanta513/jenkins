node {
    stage('one') {
    echo 'one'
    }
    agent('two') {
    echo 'two'
    }
}