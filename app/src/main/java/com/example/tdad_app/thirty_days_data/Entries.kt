package com.example.tdad_app.thirty_days_data

import com.example.tdad_app.R
val images = mutableListOf<Int>(
    R.drawable.daniel_romero_tbldlyigpj4_unsplash,
    R.drawable.denny_muller_hfwa_axq6ek_unsplash_1_,
    R.drawable.fahim_muntashir_v_fovol3onk_unsplash,
    R.drawable.denny_muller_hfwa_axq6ek_unsplash,
    R.drawable.matam_jaswanth_lypq_bq97km_unsplash,
    R.drawable.thriday_dv2g6ql39cs_unsplash,
    R.drawable.mika_baumeister_wspxkq7pxsc_unsplash,
    R.drawable.tim_wildsmith_dnfwr3or7fw_unsplash,
    R.drawable.mika_baumeister_qiplrhjiv2o_unsplash,
    R.drawable.mika_baumeister_yryufip1ngi_unsplash

)

val Entries = mutableListOf<Entry>(

    Entry(R.string.day_1,R.string.day_1_title,R.string.day_1_description,images[0]),
    Entry(R.string.day_2,R.string.day_2_title,R.string.day_2_description,images[1%images.size]),
    Entry(R.string.day_3,R.string.day_3_title,R.string.day_3_description,images[2%images.size]),
    Entry(R.string.day_4,R.string.day_4_title,R.string.day_4_description,images[3%images.size]),
    Entry(R.string.day_5,R.string.day_5_title,R.string.day_5_description,images[4%images.size]),
    Entry(R.string.day_6,R.string.day_6_title,R.string.day_6_description,images[5%images.size]),
    Entry(R.string.day_7,R.string.day_7_title,R.string.day_7_description,images[6%images.size]),
    Entry(R.string.day_8,R.string.day_8_title,R.string.day_8_description,images[7%images.size]),
    Entry(R.string.day_9,R.string.day_9_title,R.string.day_9_description,images[8%images.size]),
    Entry(R.string.day_10,R.string.day_10_title,R.string.day_10_description,images[9%images.size]),
    Entry(R.string.day_11,R.string.day_11_title,R.string.day_11_description,images[10%images.size]),
    Entry(R.string.day_12,R.string.day_12_title,R.string.day_12_description,images[11%images.size]),
    Entry(R.string.day_13,R.string.day_13_title,R.string.day_13_description,images[12%images.size]),
    Entry(R.string.day_14,R.string.day_14_title,R.string.day_14_description,images[13%images.size]),
    Entry(R.string.day_15,R.string.day_15_title,R.string.day_15_description,images[14%images.size]),
    Entry(R.string.day_16,R.string.day_16_title,R.string.day_16_description,images[15%images.size]),
    Entry(R.string.day_17,R.string.day_17_title,R.string.day_17_description,images[16%images.size]),
    Entry(R.string.day_18,R.string.day_18_title,R.string.day_18_description,images[17%images.size]),
    Entry(R.string.day_19,R.string.day_19_title,R.string.day_19_description,images[18%images.size]),
    Entry(R.string.day_20,R.string.day_20_title,R.string.day_20_description,images[19%images.size]),
    Entry(R.string.day_21,R.string.day_21_title,R.string.day_21_description,images[20%images.size]),
    Entry(R.string.day_22,R.string.day_22_title,R.string.day_22_description,images[21%images.size]),
    Entry(R.string.day_23,R.string.day_23_title,R.string.day_23_description,images[22%images.size]),
    Entry(R.string.day_24,R.string.day_24_title,R.string.day_24_description,images[23%images.size]),
    Entry(R.string.day_25,R.string.day_25_title,R.string.day_25_description,images[24%images.size]),
    Entry(R.string.day_26,R.string.day_26_title,R.string.day_26_description,images[25%images.size]),
    Entry(R.string.day_27,R.string.day_27_title,R.string.day_27_description,images[26%images.size]),
    Entry(R.string.day_28,R.string.day_28_title,R.string.day_28_description,images[27%images.size]),
    Entry(R.string.day_29,R.string.day_29_title,R.string.day_29_description,images[28%images.size]),
    Entry(R.string.day_30,R.string.day_30_title,R.string.day_30_description,images[29%images.size])
)