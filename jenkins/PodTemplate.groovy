#!groovy

def dockerTemplate(body) {
    podTemplate(
        container: [
            containerTemplate(
                name: 'docker',
                image: 'docker:latest',
                imagePullPolicy: 'Always',
                command: 'sleep',
                args: '99d'    
            )
        ],
        volumes: [
            hostPathVolume(
                hostPath: '/var/run/docker.sock',
                mountPath: '/var/run/docker.sock'
            )
        ]
    ) {
        body.call()
    }
}

return this
