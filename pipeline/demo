pipeline{
    agent any
    stages{
        stage('demo'){
            steps{
                sh 'echo "cloudkeeper-pro"'
                sh 'echo "cloudkeeper-lens"'
                sh 'echo "cloudkeeper-demo"'
            }    
        }
        stage('git-pull'){
            steps{
                sh 'echo "cloudkeeper-demo"'
                sh 'echo " first demo for shared jenkins library"'
                sh 'echo "this will add when passed args."'
            }
        }
    }
    post{
        always{
            sh 'echo "cool"'
        }
    }
}
