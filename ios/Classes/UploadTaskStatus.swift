//
//  UploadTaskStatus.swift
//  flutter_uploader
//
//  Created by Sebastian Roth on 30/10/2019.
//

import Foundation

enum UploadTaskStatus: Int {
    case undefined = 0, enqueue, running, completed, failed, canceled, paused
}
