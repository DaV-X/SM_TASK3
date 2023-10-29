package com.example.task3;

import androidx.fragment.app.Fragment;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        UUID taskId = getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID,UUID.class);
        return TaskFragment.newInstance(taskId);
    }
}