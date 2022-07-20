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
                // app = docker.build("bmc_qa_docker/PATH1")
                 app = docker.build("bmc_qa_docker", "--build-arg $path1 .");
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
                    //sh "bmc_qa_docker:latest"
                    bat "docker run -t bmc_qa_docker ${path1} :latest ."
                }
            }
        }
    }
}
