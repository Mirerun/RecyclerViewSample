package app.murauchi.mirerun.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val courseData: List<CourseData> = listOf(
        CourseData(R.drawable.buta, "ブタちゃん","ブタちゃんのプロフィール"),
        CourseData(R.drawable.hachi, "ハッチ―","ハッチ―のプロフィール"),
        CourseData(R.drawable.panda, "パンダ君","パンダ君のプロフィール"),
        CourseData(R.drawable.zou, "ぞうさん","ぞうさんのプロフィール"),
        CourseData(R.drawable.kuma, "くまごろう","くまごろうのプロフィール")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(courseData)
    }
}