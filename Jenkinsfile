pipeline {
    agent any
    stages {
        stage('Build') { 
            agent {
              docker {
               image 'maven:3-alpine'
              }
            }
            steps {
			sh '(cd ./SpringTestDemo/; mvn clean package)'
		stash name: "app", includes: "**"

            }
        }
    }
}
