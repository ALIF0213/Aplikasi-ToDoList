package com.example.leolist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetDialog

class Fragmentconten : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.dashboard, container, false)

        val toggleButtonCompleted: Button = view.findViewById(R.id.toggleButtonCompleted)
        val taskListView: ListView = view.findViewById(R.id.taskListView)
        val createTaskButton: Button = view.findViewById(R.id.toggleButtonPrevious)

        taskListView.visibility = View.GONE

        toggleButtonCompleted.setOnClickListener {
            if (taskListView.visibility == View.GONE) {
                taskListView.visibility = View.VISIBLE
            } else {
                taskListView.visibility = View.GONE
            }
        }

        createTaskButton.setOnClickListener {
            Log.d("Fragmentconten", "Create Task Button clicked!")

            // Show CreateNewTaskFragment
            val createNewTaskFragment = CreateNewTaskFragment()
            createNewTaskFragment.show(parentFragmentManager, "CreateNewTaskFragment")
        }

        return view
    }
}
