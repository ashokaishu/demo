pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Clone the Git repository
                bat 'git clone https://github.com/ashokaishu/demo.git'
            }
        }
        stage('Build ModuleA') {
            steps {
                // Navigate to ModuleA directory and build
                dir('ModuleA') {
                    bat 'mvn clean install'
                }
            }
        }
        stage('Build ModuleB') {
            steps {
                // Navigate to ModuleB directory and build
                dir('ModuleB') {
                    bat 'mvn clean install'
                }
            }
        }
        stage('Run ModuleB') {
            steps {
                // Navigate to ModuleB directory and run ModuleBMain
                dir('ModuleB') {
                    bat 'java -cp target/ModuleB.jar moduleb.ModuleBMain'
                }
            }
        }
    }
}
