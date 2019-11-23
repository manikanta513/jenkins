def a='10'
node {
    stage('one') {
    echo 'one'
    print a
    }
    stage('two') {
    echo 'two'
    }
    stage('three') {
    echo 'three'
    }
    stage('four') {
    echo 'four'
    }
}




