pipeline{
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo Hello world'
            }
        }
        stage('Deploy') {
            when {
                branch 'master'
            }
            steps {
                sh 'echo Deploying'
            }
        }
    }
}