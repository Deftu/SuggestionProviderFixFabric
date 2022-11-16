<div align="center">
<center>

# [`Suggestion Provider Fix`]
A minor change to Minecraft's suggestion provider so that it auto-completes resource locations for all mod namespaces. 

[![Ko-Fi Badge](https://raw.githubusercontent.com/intergrav/devins-badges/v2/assets/cozy/donate/kofi-singular_64h.png)](https://ko-fi.com/Deftu)  
[![CurseForge Badge](https://raw.githubusercontent.com/intergrav/devins-badges/v2/assets/cozy/available/curseforge_64h.png)](https://www.curseforge.com/minecraft/mc-mods/suggestion-provider-fix-fabric)
[![Modrinth Badge](https://raw.githubusercontent.com/intergrav/devins-badges/v2/assets/cozy/available/modrinth_64h.png)](https://modrinth.com/mod/suggestion-provider-fix-fabric)  
[![Discord Badge](https://raw.githubusercontent.com/intergrav/devins-badges/v2/assets/cozy/social/discord-singular_64h.png)](https://shr.deftu.xyz/discord)
[![GitHub Badge](https://raw.githubusercontent.com/intergrav/devins-badges/v2/assets/cozy/social/github-singular_64h.png)](https://github.com/Deftu/SuggestionProviderFixFabric)

</center>
</div>

Whilst this is a very tiny change, if you use commands a lot in modded Minecraft it is likely to save you a lot of time.  
Note that this mod does not need to be installed on a dedicated server to work, though doing so is advisable so that the client and server mod list match. 

## Example
For example, let's say you want to use `/give` to spawn yourself an `oak_seed` from Dynamic Trees. With vanilla, you may begin to type `/give @p oak_seed` and no auto-complete suggestions will come up, as it expects you to type in `dynamictrees:oak_seed` since that is the full name for the item:

![GIF without the mod](without.gif)

With this mod installed, you are able to start typing `oak_seed` and any items with that name (regardless of their namespace/mod ID) will be suggested:

![GIF with the mod](with.gif)

This also works with other registries that use "resource locations", including blocks, biomes, and even custom registries from other mods.

## Gradle Setup
This is likely to be a useful tweak in the dev environment, so I've added it to my maven repository. First, add my maven repository to the `repositories` block:

#### Groovy `build.gradle`
```groovy
maven {
    url "https://maven.deftu.xyz/releases/"
}
```

#### Kotlin `build.gradle.kts`
```kotlin
maven("https://maven.deftu.xyz/releases/")
```

Next, add it as a runtime dependency in the `dependecies` block:

#### Groovy `build.gradle`
```groovy
modRuntime("xyz.deftu:SuggestionProviderFixFabric:1.0.0")
```

#### Kotlin `build.gradle.kts`
```kotlin
modRuntime("xyz.deftu:SuggestionProviderFixFabric:SuggestionProviderFix:1.0.0")
```
