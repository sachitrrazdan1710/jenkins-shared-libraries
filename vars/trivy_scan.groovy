def call() {
    sh """
        trivy fs . \
        --skip-db-update \
        --severity HIGH,CRITICAL \
        --exit-code 1 \
        --timeout 5m
    """
}
