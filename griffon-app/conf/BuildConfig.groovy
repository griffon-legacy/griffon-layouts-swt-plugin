griffon.project.dependency.resolution = {
    inherits "global"
    log "warn"
    repositories {
        griffonHome()
        String basePath = pluginDirPath? "${pluginDirPath}/" : ''
        flatDir name: "layoutsSwtLibDir", dirs: ["${basePath}lib"]
    }
    dependencies {
        compile 'com.javadude.swt.layouts:com.javadude.swt.layouts:1.0.0'
    }
}

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}
