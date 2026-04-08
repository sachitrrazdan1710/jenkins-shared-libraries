def call() {
    sh """
        trivy fs . \
        --severity HIGH,CRITICAL \
        --cache-dir /tmp/trivy-cache
    """
}
