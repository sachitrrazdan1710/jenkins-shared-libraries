def call(String ProjectName, String ImageTag, String DockerHubUser) {
    def image = "${DockerHubUser}/${ProjectName}:${ImageTag}"

    retry(3) {
        sh """
            set -e
            echo "Pulling base image first..."
            docker pull node:18-alpine
            echo "Building Docker image: ${image}"
            docker build -t ${image} .
        """
    }
}
