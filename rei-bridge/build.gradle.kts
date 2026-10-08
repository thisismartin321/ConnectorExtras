repositories {
    maven {
        name = "TempLocal262" // TEMP: vor PR entfernen
        url = uri("https://raw.githubusercontent.com/thisismartin321/sinytra-26.2-maven/main/")
    }
    maven("https://maven.shedaniel.me")
}

dependencies {
    implementation("org.sinytra:forgified-fabric-loader:2.5.86+0.19.3+26.2")
    implementation("org.sinytra.forgified-fabric-api:fabric-api-lookup-api-v1:2.0.18+5f5192e39e")
    implementation("org.sinytra.forgified-fabric-api:fabric-transfer-api-v1:8.0.13+d6727f829e")

    implementation("me.shedaniel:RoughlyEnoughItems-neoforge:26.1.819")
    runtimeOnly("dev.architectury:architectury-neoforge:20.0.7")
    runtimeOnly("me.shedaniel.cloth:cloth-config-neoforge:26.1.154")
}
