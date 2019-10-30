//
//  UploadTask.swift
//  flutter_uploader
//
//  Created by Sebastian Roth on 30/10/2019.
//

import Foundation

struct UploadTask {
    var taskId: String
    var status: UploadTaskStatus
    var progress: Int
    var tag: String?

    init(taskId: String, status: UploadTaskStatus, progress: Int, tag: String?) {
        self.taskId = taskId
        self.status = status
        self.progress = progress
        self.tag = tag
    }
}
