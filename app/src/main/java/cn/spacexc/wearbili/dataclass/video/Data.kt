package cn.spacexc.wearbili.dataclass.video

data class Data(
    val aid: Long,
    val bvid: String,
    val cid: Long,
    val copyright: Int,
    val ctime: Int,
    val desc: String,
    val desc_v2: List<DescV2>,
    val dimension: Dimension,
    val duration: Int,
    val `dynamic`: String,
    val honor_reply: HonorReply,
    val is_chargeable_season: Boolean,
    val is_season_display: Boolean,
    val is_story: Boolean,
    val mission_id: Long,
    val no_cache: Boolean,
    val owner: Owner,
    val pages: List<Page>,
    val pic: String,
    val premiere: Any?,
    val pubdate: Long,
    val rights: Rights,
    val season_id: Long,
    val stat: Stat,
    val state: Int,
    val subtitle: Subtitles,
    val teenage_mode: Int,
    val tid: Long,
    val title: String,
    val tname: String,
    val ugc_season: UgcSeason,
    val user_garb: UserGarb,
    val videos: Int
) {
    data class Pages(val pages: List<Page>)
}