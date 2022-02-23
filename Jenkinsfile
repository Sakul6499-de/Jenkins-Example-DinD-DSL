podTemplate(yaml: '''
apiVersion: v1
kind: Pod
spec:
    containers:
    - name: docker
      image: docker:latest
      imagePullPolicy: Always
      command: ["/bin/sh", "-c", "sleep 1d"]
      env:
      - name: DOCKER_HOST
        value: tcp://localhost:2375
    - name: docker-deamon
      image: docker:dind
      imagePullPolicy: Always
      command: ["/bin/sh", "-c", "sleep 1d"]
      securityContext:
        privileged: true
''') {
    node(POD_LABEL) {
        stage('Testing') {
            container('docker') {
                sh 'sleep 30'
                sh 'docker info'
            }
        }
    }
}
