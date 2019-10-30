//
//  UploadTaskCache.swift
//  flutter_uploader
//
//  Created by Sebastian Roth on 30/10/2019.
//

import Foundation

// https://stackoverflow.com/a/51066221/375209 - thank you
class UploadTaskCache {
    private let queue = DispatchQueue(label: "UploadTaskCache")
    private var storage: [String: UploadTask] = [:]
    
    @discardableResult
    public func removeValue(forKey key: String) -> UploadTask? {
        return queue.sync {
            return storage.removeValue(forKey: key)
        }
    }
    
    public func removeAll() {
        queue.sync {
            return storage.removeAll()
        }
    }
    
    public subscript(key: String) -> UploadTask? {
        get {
            return queue.sync {
                return storage[key]
            }
        }
        set {
            queue.sync {
                storage[key] = newValue
            }
        }
    }
}
