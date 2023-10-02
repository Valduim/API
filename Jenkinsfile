pipeline {
    agent any 

    stages {
        stage('Print Message') {
            when {
                not {
                    branch 'pruebas'
                }
            }
            steps {
                echo 'Se ha realizado un commit a master'
            }
        }
    }
}

