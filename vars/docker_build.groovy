def call(String ProjectName, String ImageTag, String DockerHubUser) {
    def image = "${DockerHubUser}/${ProjectName}:${ImageTag}"

    retry(3) {
        sh """
            echo "Building Docker image: ${image}"
            docker build --pull -t ${image} .
        """
    }
}
