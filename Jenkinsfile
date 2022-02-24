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
        sh 'echo hello from $POD_CONTAINER'
        sh 'mvn -version'
        sh 'docker info'
    }
}
