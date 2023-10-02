pipeline {
  agent any
  stages {
    stage('error') {
      steps {
        echo 'Hola mundo'
        git(credentialsId: '5ada45f', url: 'https://github.com/Valduim/API.git', branch: 'develop')
      }
    }

  }
}