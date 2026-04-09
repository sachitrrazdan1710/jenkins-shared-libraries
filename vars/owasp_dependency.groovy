def call(){
  dependencyCheck(
    additionalArguments: '''
      --scan . 
      --data /tmp/dependency-check-data 
      --disableAssembly 
      --disableNodeAudit
    ''',
    odcInstallation: 'OWASP'
  )

  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
