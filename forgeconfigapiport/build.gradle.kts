repositories {
    maven {
        name = "TempLocal262" // TEMP: vor PR entfernen
        url = uri("https://raw.githubusercontent.com/thisismartin321/sinytra-26.2-maven/main/")
    }
    maven {
        name = "Fuzs Mod Resources"
        url = uri("https://raw.githubusercontent.com/Fuzss/modresources/main/maven/")
    }
}

dependencies {
    implementation("org.sinytra.forgified-fabric-api:fabric-api-base:2.0.4+d41ec0009e")

    jarJar(implementation("fuzs.forgeconfigapiport:forgeconfigapiport-common-forgeapi:26.1.5") {
        version { 
            strictly("[26.1,)")
            prefer("26.1.5")
        }
    })
    implementation("fuzs.forgeconfigapiport:forgeconfigapiport-neoforge:26.1.5")
}
