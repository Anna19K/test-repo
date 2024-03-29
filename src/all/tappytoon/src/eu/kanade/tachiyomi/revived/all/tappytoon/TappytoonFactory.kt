package eu.kanade.tachiyomi.revived.all.tappytoon

import eu.kanade.tachiyomi.source.SourceFactory

class TappytoonFactory : SourceFactory {
    private val langs = setOf("en", "fr", "de")

    override fun createSources() = langs.map(::Tappytoon)
}
