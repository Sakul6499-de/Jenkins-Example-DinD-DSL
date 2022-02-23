podTemplate(yaml: '''
apiVersion: v1
kind: Pod
spec:
    containers:
    - name: docker
      image: docker:dind
      imagePullPolicy: Always
      securityContext:
        privileged: true
''') {
    node(POD_LABEL) {
        stage('Testing') {
            container('docker') {
                sh 'docker info'
            }
        }
    }
}
