node {
    def app

    stage('Clone repository') {
        checkout scm
    }

    stage('Build image') {
        /* This builds the actual image; synonymous to
         * docker build on the command line */

        app = docker.build("akel/bmc_qa_docker")
    }

    stage('Test image') {
        app.inside {
            sh 'echo "Tests passed"'
        }
    }

    stage('Docker Run') {
          agent any
          steps {
            sh 'docker run -t akel/bmc_qa_docker:latest .'
          }
    }
}