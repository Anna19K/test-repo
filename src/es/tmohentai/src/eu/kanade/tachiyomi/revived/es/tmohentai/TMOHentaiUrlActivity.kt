package eu.kanade.tachiyomi.revived.es.tmohentai

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlin.system.exitProcess

/**
 * Springboard that accepts https://tmohentai.com/contents/:id intents and redirects them to
 * the main Tachiyomi process.
 */
class TMOHentaiUrlActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val pathSegments = intent?.data?.pathSegments

        if (pathSegments != null && pathSegments.size > 1) {
            val id = pathSegments[1]

            val mainIntent = Intent().apply {
                action = "eu.kanade.tachiyomi.SEARCH"
                putExtra("query", "${TMOHentai.PREFIX_ID_SEARCH}$id")
                putExtra("filter", packageName)
            }

            try {
                startActivity(mainIntent)
            } catch (e: ActivityNotFoundException) {
                Log.e("TMOHentaiUrlActivity", e.toString())
            }
        } else {
            Log.e("TMOHentaiUrlActivity", "could not parse uri from intent $intent")
        }

        finish()
        exitProcess(0)
    }
}
