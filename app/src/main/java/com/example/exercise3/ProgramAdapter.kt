import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exercise3.R
import com.example.exercise3.Workout
import com.google.android.material.imageview.ShapeableImageView

class ProgramAdapter(private val newsList : ArrayList<Workout>) : RecyclerView.Adapter<ProgramAdapter.MyViewHolder>(),
    Filterable {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.list_program,
            parent,false)

        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = newsList[position]
        holder.workout.text = currentItem.workout
        holder.sets.text = currentItem.sets
        holder.reps.text = currentItem.reps


    }


    override fun getItemCount(): Int {

        return newsList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val workout: TextView = itemView.findViewById(R.id.workout)
        val sets: TextView = itemView.findViewById(R.id.sets)
        val reps: TextView = itemView.findViewById(R.id.reps)


    }

    override fun getFilter(): Filter {
        TODO("Not yet implemented")
    }

}