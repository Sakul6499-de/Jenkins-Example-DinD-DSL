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
    // node(POD_LABEL) { 
    container('docker') {
        sh 'env'
        sh 'echo hello from $POD_CONTAINER'
        sh 'docker info'
    }
    // }
}
