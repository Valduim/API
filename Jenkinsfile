pipeline {
  agent any

  tools {nodejs "node"}

  stages {

    //REPOSITORIO
    stage('Git') {
      steps {
        git 'https://github.com/Valduim/API.git'
      }
    }

    //NODE BUILD
    stage('Build and Test Node.js App') {
            steps {
                sh 'npm install'
                sh 'npm test'
                sh 'npm run'
                sh 'npm build'
            }
        } 

    //JAVA BUILD
    stage('Build and Test Spring Boot App') {
            steps {
                sh './mvnw clean package'  // Construir la aplicación Spring Boot
                sh './mvnw test'           // Ejecutar pruebas de Spring Boot
            }
        } 

      /*   //IMAGE BUILD
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t mi-app:latest .'  // Construir la imagen Docker
            }
        } 


    stage('Test') {
      steps {
        sh 'node test'
      }
    }*/
  }
}
