podTemplate(
    containers: [
        containerTemplate(
            image: 'docker', 
            name: 'docker', 
            command: 'cat', 
            ttyEnabled: true
        )
    ],
    volumes: [
        hostPathVolume(
            hostPath: '/var/run/docker.sock', 
            mountPath: '/var/run/docker.sock'
        )
    ]
) {
    node(POD_LABEL) { 
        stage('Setup') {
            container('docker') {
                git credentialsId: 'GitHub', url: 'https://github.com/Sakul6499-de/Jenkins-DinD-Test-Repo.git', branch: 'main'
            }
        }
        stage('Build') {
            container('docker') {
                sh 'docker build .'
            }
        }
    }
}
