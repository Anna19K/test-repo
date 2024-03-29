package eu.kanade.tachiyomi.revived.es.tenkaiscan

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesia
import java.text.SimpleDateFormat
import java.util.Locale

class TenkaiScan : MangaThemesia(
    "TenkaiScan",
    "https://tenkaiscan.net",
    "es",
    dateFormat = SimpleDateFormat("MMMM dd, yyyy", Locale("en")),
)
