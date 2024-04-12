pipeline {
    agent any 
    stages {
        stage('Checkout') {
            steps {
                // Clone the Git repository
                echo 'Hi'
            }
        }
        stage('Build ModuleA') {
            steps {
                // Navigate to ModuleA directory and build
                dir('ModuleA') {
                    bat 'build_moduleA.bat'
                }
            }
        }
        stage('Build ModuleB') {
            steps {
                // Navigate to ModuleB directory and build
                dir('ModuleB') {
                    bat 'java ModuleBCalculator.java'
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
