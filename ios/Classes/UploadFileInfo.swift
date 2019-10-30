//
//  UploadFileInfo.swift
//  flutter_uploader
//
//  Created by Sebastian Roth on 30/10/2019.
//

import Foundation

struct UploadFileInfo {
    var fieldname: String
    var filename: String
    var savedDir: String
    var mimeType: String
    var path: String
    var temporalFilePath: URL?

    init(fieldname: String, filename: String, savedDir: String, temporalFilePath: URL? = nil) {
        self.fieldname = fieldname
        self.filename = filename
        self.savedDir = savedDir
        self.path = "\(savedDir)/\(filename)"
        self.temporalFilePath = temporalFilePath
        let mime = MimeType(url: URL(fileURLWithPath: path))
        self.mimeType = mime.value
    }
}
