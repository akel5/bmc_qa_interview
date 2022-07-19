pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    environment {
        PATH = "C:\\WINDOWS\\SYSTEM32;C:\\Program Files\\Docker\\Docker\\resources\\bin"
    }
    stages {
         stage('Clone repository') {
            steps {
                script{
                checkout scm
                }
            }
        }

        stage('Build') {
            steps {
                script{
                 app = docker.build("bmc_qa_docker")
                }
            }
        }
        stage('Test'){
            steps {
                 echo 'Empty'
            }
        }
        stage('Run') {
            steps {
                script {
                    //sh "docker run -t bmc_qa_docker:latest ."
                    sh "bmc_qa_docker:latest"
                }
            }
        }
    }
}
