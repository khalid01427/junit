pipeline {
    agent any
    stages {
			// Stage1------------
			stage('Unit test') {
				steps {
					echo 'Unit Testing phase'
				}
			}
			// Stage2---------
			 stage('Build') {
				steps {
					echo 'Building application'
				}
			}
			// Stage3---------
			 stage('Test') {
				steps {
					echo 'Testing application'
				}
			}
			 stage('Deploy') {
				steps {
					echo 'Deploying application'
				}
			}
    }
}
