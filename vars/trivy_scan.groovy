def call() {
    sh """
        trivy fs . \
        --severity HIGH,CRITICAL \
        --scanners vuln \
        --cache-dir /tmp/trivy-cache \
        --skip-db-update \
        --skip-dirs node_modules \
        --skip-dirs frontend/node_modules \
        --skip-dirs backend/node_modules
    """
}
