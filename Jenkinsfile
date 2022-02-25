podTemplate(
    containers: [
        containerTemplate(
            image: 'docker', 
            name: 'docker', 
            command: 'cat', 
            ttyEnabled: true
        )
    ]
) {
    node(POD_LABEL) { 
        container('docker') {
            sh 'echo hello from $POD_CONTAINER'
            sh 'pwd'
            sh 'ls -al .'
            sh 'docker build .'
        }
    }
}
