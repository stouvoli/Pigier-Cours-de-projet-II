import sun.jvmstat.monitor.MonitoredVmUtil.mainClass

plugins {
    id("java")
    application
    // Plugin officiel pour automatiser la configuration de JavaFX
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "ci.pgier"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    // Le chemin complet : package + nom de la classe
    mainClass.set("ci.pigier.HelloFXApp")
}

javafx {
    // Version alignée sur le JDK 24
    version = "24"
    // Modules de base pour les interfaces et le FXML
    modules("javafx.controls", "javafx.fxml")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}
