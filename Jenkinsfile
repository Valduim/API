pipeline {
  agent any
  stages {
    stage('Clonar Repositorio') {
            steps {
                // Clonar el repositorio del código fuente
                // Puedes personalizar la URL y las credenciales si es necesario
                checkout([$class: 'GitSCM', branches: [[name: 'develop']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '5ada45f', url: 'https://github.com/Valduim/API.git']]])
            }
        }
  }
}
