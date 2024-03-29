package eu.kanade.tachiyomi.revived.th.nekopost.model

import kotlinx.serialization.Serializable

@Serializable
data class RawChapterInfo(
    val chapterId: Int,
    val chapterNo: String,
    val pageItem: List<RawPageItem>,
    val projectId: String,
)
